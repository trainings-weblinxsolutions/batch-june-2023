package classes_objects;

public class CompareEntertainments {

	public static void main(String[] args) {

		Movie julai = new Movie();
		julai.name = "Julai";
		julai.director = "Trivikram";
		julai.stuntMaster = "Peter Hein";
		julai.numberOfArtists = 57;
		julai.releaseDate = "15-Aug-2012";

		julai.collectionsFirstWeek = 215467.8;
		julai.collectionsRestOfTheDays = 541132.5;

		Drama ramayan = new Drama();
		ramayan.name = "Ramayana";
		ramayan.writer = "Valmiki";
		ramayan.stageSetter = "Anjaneya";
		ramayan.numberOfArtists = 200000;
		ramayan.releaseDate = "17-Mar-1659 BC";

		ramayan.collectionsFirstWeek = 32842.86;
		ramayan.collectionsRestOfTheDays = 93349.51;

		Circus jumbo = new Circus();
		jumbo.name = "Jumbo";
		jumbo.ringMaster = "Antony";
		jumbo.numberOfArtists = 316;
		jumbo.releaseDate = "16-Dec-1997";

		jumbo.collectionsFirstWeek = 21232.21;
		jumbo.collectionsRestOfTheDays = 2325.09;

		if ((jumbo.getTotalCollections() > julai.getTotalCollections())
				&& (jumbo.getTotalCollections() > ramayan.getTotalCollections())) {
			jumbo.print();
		} else if (julai.getTotalCollections() > ramayan.getTotalCollections()) {
			julai.print();
		} else {
			ramayan.print();
		}

	}
}

class Movie {
	String name;
	String director;
	String stuntMaster;
	int numberOfArtists;
	String releaseDate;
	double collectionsFirstWeek;
	double collectionsRestOfTheDays;

	double getTotalCollections() {
		return collectionsFirstWeek + collectionsRestOfTheDays;
	}

	void print() {
		System.out.println(name + " got the following collections ");
		System.out.println("First Week : " + collectionsFirstWeek);
		System.out.println("Rest Of The Days : " + collectionsRestOfTheDays);
		System.out.println("Total Collections : " + getTotalCollections());
		System.out.println("Total Actors : " + numberOfArtists);
		System.out.println("Release Date : " + releaseDate);
		System.out.println("Director : " + director);
		System.out.println("Stunt Master : " + stuntMaster);
	}
}

class Drama {
	String name;
	String writer;
	String stageSetter;
	int numberOfArtists;
	String releaseDate;
	double collectionsFirstWeek;
	double collectionsRestOfTheDays;

	double getTotalCollections() {
		return collectionsFirstWeek + collectionsRestOfTheDays;
	}

	void print() {
		System.out.println(name + " got the following collections ");
		System.out.println("First Week : " + collectionsFirstWeek);
		System.out.println("Rest Of The Days : " + collectionsRestOfTheDays);
		System.out.println("Total Collections : " + getTotalCollections());
		System.out.println("Total Actors : " + numberOfArtists);
		System.out.println("Release Date : " + releaseDate);
		System.out.println("Writer : " + writer);
		System.out.println("Stage Setter : " + stageSetter);
	}
}

class Circus {
	String name;
	String ringMaster;
	int numberOfArtists;
	String releaseDate;

	double collectionsFirstWeek;
	double collectionsRestOfTheDays;

	double getTotalCollections() {
		return collectionsFirstWeek + collectionsRestOfTheDays;
	}

	void print() {
		System.out.println(name + " got the following collections ");
		System.out.println("First Week : " + collectionsFirstWeek);
		System.out.println("Rest Of The Days : " + collectionsRestOfTheDays);
		System.out.println("Total Collections : " + getTotalCollections());
		System.out.println("Total Actors : " + numberOfArtists);
		System.out.println("Release Date : " + releaseDate);
		System.out.println("Ring Master : " + ringMaster);
	}
}
