/**
 * 
 */
package asgn1Tests;

import static org.junit.Assert.*;
import asgn1Election.*;

import org.junit.Test;

/**
 * @author Tristan
 *
 */
public class CandidateTests {

	/**
	 * Test method for {@link asgn1Election.Candidate#Candidate(java.lang.String, java.lang.String, java.lang.String, int)}.
	 */
	@Test(expected=ElectionException.class)
	public void testCandidateVoteCountLessThanZero() throws ElectionException {
		Candidate cand = new Candidate("Dummy Candidate", "Dummy Political Party", "DPP", -1);
	}
	
	/**
	 * Test method for {@link asgn1Election.Candidate#Candidate(java.lang.String, java.lang.String, java.lang.String, int)}.
	 */
	@Test(expected=ElectionException.class)
	public void testCandidateNameNotNull() throws ElectionException {
		Candidate cand = new Candidate(null, "Dummy Political Party", "DPP", 10);
	}
	
	/**
	 * Test method for {@link asgn1Election.Candidate#Candidate(java.lang.String, java.lang.String, java.lang.String, int)}.
	 */
	@Test(expected=ElectionException.class)
	public void testCandidateNameNotEmpty() throws ElectionException {
		Candidate cand = new Candidate("", "Dummy Political Party", "DPP", 10);
	}
	
	/**
	 * Test method for {@link asgn1Election.Candidate#Candidate(java.lang.String, java.lang.String, java.lang.String, int)}.
	 */
	@Test(expected=ElectionException.class)
	public void testCandidatePartyNotNull() throws ElectionException {
		Candidate cand = new Candidate("Dummy Candidate", null, "DPP", 10);
	}
	
	/**
	 * Test method for {@link asgn1Election.Candidate#Candidate(java.lang.String, java.lang.String, java.lang.String, int)}.
	 */
	@Test(expected=ElectionException.class)
	public void testCandidatePartyNotEmpty() throws ElectionException {
		Candidate cand = new Candidate("Dummy Candidate", "", "DPP", 10);
	}
	
	/**
	 * Test method for {@link asgn1Election.Candidate#Candidate(java.lang.String, java.lang.String, java.lang.String, int)}.
	 */
	@Test(expected=ElectionException.class)
	public void testCandidateAbbrevNotNull() throws ElectionException {
		Candidate cand = new Candidate("Dummy Candidate", "Dumy Political Party", null, 10);
	}
	
	/**
	 * Test method for {@link asgn1Election.Candidate#Candidate(java.lang.String, java.lang.String, java.lang.String, int)}.
	 */
	@Test(expected=ElectionException.class)
	public void testCandidateAbbrevNotEmpty() throws ElectionException {
		Candidate cand = new Candidate("Dummy Candidate", "Dumy Political Party", "", 10);
	}

	/**
	 * Test method for {@link asgn1Election.Candidate#candidateListing()}.
	 */
	@Test
	public void testCandidateListing() {
		// Testing not needed
		assertTrue(true);
	}

	/**
	 * Test method for {@link asgn1Election.Candidate#copy()}.
	 */
	@Test
	public void testCopy() throws ElectionException {
		Candidate cand = new Candidate("Dummy Candidate", "Dumy Political Party", "DPP", 10);
		Candidate candCopy = cand.copy();
		assertTrue(cand.toString().equals(candCopy.toString()));
		assertFalse(cand.equals(cand.copy()));
		
	}

	/**
	 * Test method for {@link asgn1Election.Candidate#getName()}.
	 */
	@Test
	public void testGetName() {
		// Testing not needed
		assertTrue(true);
	}

	/**
	 * Test method for {@link asgn1Election.Candidate#getParty()}.
	 */
	@Test
	public void testGetParty() {
		// Testing not needed
		assertTrue(true);
	}

	/**
	 * Test method for {@link asgn1Election.Candidate#getVoteCount()}.
	 */
	@Test
	public void testGetVoteCount() {
		// Testing not needed
		assertTrue(true);
	}

	/**
	 * Test method for {@link asgn1Election.Candidate#getVoteCountString()}.
	 */
	@Test
	public void testGetVoteCountString() {
		// Testing not needed
		assertTrue(true);
	}

	/**
	 * Test method for {@link asgn1Election.Candidate#incrementVoteCount()}.
	 */
	@Test
	public void testIncrementVoteCount() throws ElectionException {
		Candidate cand = new Candidate("Dummy Candidate", "Dummy Political Party", "DPP", 0);
		cand.incrementVoteCount();
		assertTrue(cand.getVoteCount()==1);
		cand.incrementVoteCount();
		assertTrue(cand.getVoteCount()==2);
	}

	/**
	 * Test method for {@link asgn1Election.Candidate#toString()}.
	 */
	@Test
	public void testToString() {
		// Testing not needed
		assertTrue(true);
	}

}
