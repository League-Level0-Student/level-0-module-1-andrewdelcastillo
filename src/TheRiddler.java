import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int x = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String input = JOptionPane.showInputDialog(null,"What can travel while staying in a corner?");
	
// 4. If they got the answer right, pop up "correct!" and increase the score by one
if(input.equals("a stamp")) {
		// 5. Otherwise, say "wrong" and tell them the answer
JOptionPane.showMessageDialog(null,"correct");
}else {
	
		// 6. Add some more riddles
JOptionPane.showMessageDialog(null, "incorrect");
		// 2. Make a pop up to show the score.
String input2 = JOptionPane.showInputDialog(null,"what can run the fastest?");

//4. If they got the answer right, pop up "correct!" and increase the score by one
if(input2.equals("a cheetah")) {
		// 5. Otherwise, say "wrong" and tell them the answer
JOptionPane.showMessageDialog(null,"correct");
}else {
	
		// 6. Add some more riddles
JOptionPane.showMessageDialog(null, "incorrect");
	}
}
}

	
	
	
}
