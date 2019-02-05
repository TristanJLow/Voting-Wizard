/**
 * 
 * This file is part of the VotingWizard Project, written as 
 * part of the assessment for CAB302, Semester 1, 2016. 
 * 
 */
package asgn1Election;

import java.util.Collection;

import asgn1Util.Strings;

/**
 * 
 * Subclass of <code>Election</code>, specialised to simple, first past the post voting
 * 
 * @author hogan
 * 
 */
public class SimpleElection extends Election {

	/**
	 * Simple Constructor for <code>SimpleElection</code>, takes name and also sets the 
	 * election type internally. 
	 * 
	 * @param name <code>String</code> containing the Election name
	 */
	public SimpleElection(String name) {
		super(name);
		name = this.name;
		type = 0;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see asgn1Election.Election#findWinner()
	 */
	@Override
	public String findWinner() {
		// Creates the variable to be printed
		String results = "";
		vc.countPrimaryVotes(cds);
		// Sets the number of votes to -1 in case of a vote with no votes.
		int nVotes = -1;
		// Loops through the candidates and compares their number of votes to the previous candidate with the highest number of votes
		for (int i = 1; i <= cds.size(); i++) {
			CandidateIndex candidateIndex = new CandidateIndex(i);
			Candidate candidate = cds.get(candidateIndex);
			if (candidate.getVoteCount() > nVotes) {
				winner = cds.get(candidateIndex);
				nVotes = candidate.getVoteCount();
			}
		}
		// Prints the results
		results += showResultHeader() + "Counting primary votes; " + cds.size() + " alternatives available\n" + reportCountResult() + reportWinner(clearWinner(numVotes/2));
		return results;
	}

	/* 
	 * (non-Javadoc)
	 * @see asgn1Election.Election#isFormal(asgn1Election.Vote)
	 */
	@Override
	public boolean isFormal(Vote v) {
		// A variable to count the number of first preferences
		int firstPrefIncrement = 0;
		// Loops through preferences in a vote and checks if the candidate exists and if there has been more than one first preference in the loop.
		for (int pref : v) {
			if (pref > numCandidates || firstPrefIncrement > 1) {
				return false;
			}
			if (pref == 1) { 
				firstPrefIncrement ++ ;
			}
		}
		// Checks if there was a first preference, if not the vote is not formal.
		if (firstPrefIncrement == 1) {
			return true;
		}
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		String str = this.name + " - Simple Voting";
		return str;
	}
	
	// Protected and Private/helper methods below///

	/*
	 * (non-Javadoc)
	 * 
	 * @see asgn1Election.Election#clearWinner(int)
	 */
	@Override
	protected Candidate clearWinner(int wVotes) {
		Candidate winner = null;
		for (Candidate cand : cds.values()) {
			if (winner == null || winner.getVoteCount() < cand.getVoteCount()){
				winner = cand;
			}
		}
		return winner;
	} 

	/**
	 * Helper method to create a string reporting the count result
	 * 
	 * @return <code>String</code> containing summary of the count
	 */
	private String reportCountResult() {
		String str = "\nSimple election: " + this.name + "\n\n"
				+ candidateVoteSummary() + "\n";
		String inf = "Informal";
		String voteStr = "" + this.vc.getInformalCount();
		int length = ElectionManager.DisplayFieldWidth - inf.length()
				- voteStr.length();
		str += inf + Strings.createPadding(' ', length) + voteStr + "\n\n";

		String cast = "Votes Cast";
		voteStr = "" + this.numVotes;
		length = ElectionManager.DisplayFieldWidth - cast.length()
				- voteStr.length();
		str += cast + Strings.createPadding(' ', length) + voteStr + "\n\n";
		return str;
	}
}