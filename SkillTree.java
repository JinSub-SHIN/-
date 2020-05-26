package algoTest2;

class Solution7 {
    public int solution(String skill, String[] skill_trees) {        
    	int count = 0;    	
    	for(String str : skill_trees) {
    		int i = (skill.indexOf(str.replaceAll("[^"+skill+"]", ""))==0) ? count++ : count;    		 
    	}
    	return count;    
    }
}


public class SkillTree {

	public static void main(String[] args) {	
		
		/*
		 *  https://programmers.co.kr/learn/courses/30/lessons/49993
		 */
		
		String skill = "CBD";
		String skill_trees []  = {"BACDE", "CBADF", "AECB", "GCDF"};
		
		Solution7 sol = new Solution7();
		System.out.println(sol.solution(skill, skill_trees));		
	}
	
}


