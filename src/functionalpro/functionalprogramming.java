package functionalpro;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;

public class functionalprogramming {
	
	public static void main(String[] args){
		
		Path path = Paths.get("Movie-Data.txt");
		
		//1
		/*
		try {
			Optional<String> temp = Files.lines(path)
				.sorted((line1, line2) -> (Double.valueOf(getSales(line2)).compareTo(Double.valueOf(getSales(line1)))))
				.findFirst();
			System.out.println(temp.get());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		//2
		/*
		try {
			double seventies = Files.lines(path)
					.filter((line) -> (Integer.valueOf(getYear(line)) < 1980))
					.filter((line) -> (Integer.valueOf(getYear(line)) > 1969))
					.mapToDouble(line -> Double.valueOf(getSales(line)))
					.sum();
			
			double eighties = Files.lines(path)
					.filter((line) -> (Integer.valueOf(getYear(line)) < 1990))
					.filter((line) -> (Integer.valueOf(getYear(line)) > 1979))
					.mapToDouble(line -> Double.valueOf(getSales(line)))
					.sum();
			
			if (seventies > eighties)
				System.out.println("The 70's made more money.");
			else 
				System.out.println("The 80's made more money.");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		//3
		/*
		try {
			Files.lines(path)
				.filter((line) ->  (Double.valueOf(getSales(line)) > 500))
				.forEach((line) -> System.out.println(line));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
	}

	private static String getTitle(String s) {
		return s.split("[|]")[0];
	}

	private static String getStudio(String s) {
		return s.split("[|]")[1];
	}

	private static String getSales(String s) {
		return s.split("[|]")[2];
	}

	private static String getYear(String s) {
		return s.split("[|]")[3];
	}
}
