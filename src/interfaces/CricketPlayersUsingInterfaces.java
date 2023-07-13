package interfaces;

public class CricketPlayersUsingInterfaces {
public static void main(String[] args) {
	
	
    StrongBatsmen sachin = new StrongBatsmen("Sachin", 250, 11324, 100, 125);
    
    StrongWicketKeeper dhoni = new StrongWicketKeeper("Dhoni", 153, 6021, 120, 12);
    
    AllRounderBatsmen yuvraj = new AllRounderBatsmen("Yuvraj", 105, 6533, 15, 46);
    
    StrongBowler umesh = new StrongBowler("Umesh", 25, 150, 105, 2);
    
    AllRounderBowler ashwin = new AllRounderBowler("Aswin", 15, 200, 60, 2);
    
	
	
}
}

abstract class Player
{
    String name;
    int matchesPlayed;
    int runsScored;
    Player(String name, int matchesPlayed, int runsScored)
    {
        this.name = name;
        this.matchesPlayed = matchesPlayed;
        this.runsScored = runsScored;
    }
    public void bat()
    {
    }
    public void makeSomeRuns()
    {
    }
    void print()
    {
        System.out.print(name  + " played " + matchesPlayed + " matches and scored " + runsScored + " runs.");
    }
}

class StrongBatsmen extends Player implements IBatsmen{
	
	
    int numberOfCenturies;
    int numberOfHalfCenturies;


    StrongBatsmen(String name, int matchesPlayed, int runsScored, int numberOfCenturies, int numberOfHalfCenturies)
    {
        super(name, matchesPlayed, runsScored);
        this.numberOfCenturies = numberOfCenturies;
        this.numberOfHalfCenturies = numberOfHalfCenturies;
    }


	@Override
	public void openInnings() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void makeCentury() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void makeHalfCentury() {
		// TODO Auto-generated method stub
		
	}
	
	void print()
    {    
        super.print();
        System.out.print(" He is a strong batsmen and made " + numberOfCenturies +  " centuries and " + numberOfHalfCenturies + " half centuries.");
    }

	
}


class StrongBowler extends Player implements IBowler
{
    int numberOfWickets;
    int numberOf5WicketInnings;
    
    StrongBowler(String name, int matchesPlayed, int runsScored, int numberOfWickets, int numberOf5WicketInnings)
    {
        super(name, matchesPlayed, runsScored);
        this.numberOfWickets= numberOfWickets;
        this.numberOf5WicketInnings = numberOf5WicketInnings;
    }

    public void openInnings()
    {
    }

    public void bowlYorkers()
    {
        System.out.println("Strong Bowler " + name + " is bowling yorkers.");
    }
    
    public void takeWickets()
    {
        System.out.println("Strong Bowler " + name + " is taking wickets.");
    }

    void print()
    {    
        super.print();
        System.out.print(" He is also a good bowler and has taken " + numberOfWickets + " wickets. He has " + numberOf5WicketInnings + " 5WI(5-Wicket Innings) in his account.");
    }

}

class StrongWicketKeeper extends Player implements IKeeper
{
    int numberOfCatches;
    int numberOfStumpings;
    
    StrongWicketKeeper(String name, int matchesPlayed, int runsScored, int numberOfCatches, int numberOfStumpings)
    {
        super(name, matchesPlayed, runsScored);
        this.numberOfCatches = numberOfCatches;
        this.numberOfStumpings = numberOfStumpings;
    }

   

    void print()
    {    
        super.print();
        System.out.print(" He also keeps the wickets and has " + numberOfCatches + " catches and " + numberOfStumpings + " stumpings in his account.");
    }



	@Override
	public void keepWickets() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void stumpBatsmen() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void makeAppeals() {
		// TODO Auto-generated method stub
		
	}
}

class AllRounderBatsmen extends StrongBatsmen implements IBowler
{

    AllRounderBatsmen(String name, int matchesPlayed, int runsScored, int numberOfCenturies, int numberOfHalfCenturies)
    {
        super(name, matchesPlayed, runsScored, numberOfCenturies, numberOfHalfCenturies);
    }

    public void openInnings()
    {
    }

    public void bowlYorkers()
    {
        System.out.println("All Rounder Batsmen " + name + " is bowling yorkers.");
    }
    
    public void takeWickets()
    {
        System.out.println("All Rounder Batsmen " + name + " is taking wickets.");
    }
}

class AllRounderBowler extends StrongBowler implements IBatsmen
{

    AllRounderBowler(String name, int matchesPlayed, int runsScored, int numberOfWickets, int numberOf5WicketInnings)
    {
        super(name, matchesPlayed, runsScored, numberOfWickets, numberOf5WicketInnings);
    }

    public void openInnings()
    {
    }

    public void makeCentury()
    {
    }
    
    public void makeHalfCentury()
    {
    }
}

class MultipleImplementation implements IBatsmen,IBowler{

	@Override
	public void bowlYorkers() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void takeWickets() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bat() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void makeSomeRuns() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void openInnings() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void makeCentury() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void makeHalfCentury() {
		// TODO Auto-generated method stub
		
	}
	
}



interface IBatsmen
{
    void bat();

    void makeSomeRuns();

    void openInnings();

    void makeCentury();

    void makeHalfCentury();
}

interface IBowler
{
    void openInnings();

    void bowlYorkers();
    void takeWickets();
}

interface IKeeper
{
	
    void keepWickets();

    void stumpBatsmen();

    void makeAppeals();
}


interface ICaptain
{
    void selectTeam();
    
    void setField();
}


interface IAllRounder extends IBatsmen,IBowler,IKeeper{
	
}




class AllRounderImpl implements IAllRounder{

	@Override
	public void bat() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void makeSomeRuns() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void openInnings() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void makeCentury() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void makeHalfCentury() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bowlYorkers() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void takeWickets() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keepWickets() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stumpBatsmen() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void makeAppeals() {
		// TODO Auto-generated method stub
		
	}
	
}