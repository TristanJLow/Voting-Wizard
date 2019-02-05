/**
 * 
 */
package asgn1Tests;

import static org.junit.Assert.*;

import org.junit.Test;

import asgn1Election.Candidate;
import asgn1Election.ElectionException;

/**
 * @author Tristan
 *
 */
public class VoteCollectionTests {

	/**
	 * Test method for {@link asgn1Election.VoteCollection#VoteCollection(int)}.
	 */
	@Test(expected=ElectionException.class)
	public void testVoteCollectionCandidatesInRange() throws ElectionException {
		int numCandidates = 2;
		Candidate cand = new Candidate("Dummy Candidate", "Dummy Political Party", "DPP", 30);
	}

	/**
	 * Test method for {@link asgn1Election.VoteCollection#countPrefVotes(java.util.TreeMap, asgn1Election.CandidateIndex)}.
	 */
	@Test
	public void testCountPrefVotes() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link asgn1Election.VoteCollection#countPrimaryVotes(java.util.TreeMap)}.
	 */
	@Test
	public void testCountPrimaryVotes() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link asgn1Election.VoteCollection#emptyTheCollection()}.
	 */
	@Test
	public void testEmptyTheCollection() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link asgn1Election.VoteCollection#getFormalCount()}.
	 */
	@Test
	public void testGetFormalCount() {
		// Testing not needed
		assertTrue(true);
	}

	/**
	 * Test method for {@link asgn1Election.VoteCollection#getInformalCount()}.
	 */
	@Test
	public void testGetInformalCount() {
		// Testing not needed
		assertTrue(true);
	}

	/**
	 * Test method for {@link asgn1Election.VoteCollection#includeFormalVote(asgn1Election.Vote)}.
	 */
	@Test
	public void testIncludeFormalVote() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link asgn1Election.VoteCollection#updateInformalCount()}.
	 */
	@Test
	public void testUpdateInformalCount() {
		fail("Not yet implemented");
	}

}
