package wc;

public class Trackactions {

	public void dotracking(Move move) {
 		move.racing();
		move.offroad();
		move.medical();
		move.daily();
		move.electric();
		System.out.println(move.getMoveType());
		
	}
	}