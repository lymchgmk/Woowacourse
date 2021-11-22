package subway.domain;

import java.util.Scanner;

import subway.Constants;

public class Page {
	public Page(String userInput, Scanner scanner) {
		if (userInput == "1") {
			Page.MainPage();
		}
		else if (userInput == "2") {
			Page.LineManagePage();
		}
		else if (userInput == "3") {
			Page.SectionManagePage();
		}
		else if (userInput == "4") {
			Page.MapManagePage();
		}
	}

	public static void MainPage() {
		System.out.println(Constants.MAIN_TITLE);
		System.out.println(Constants.MAIN_OPTION_1);
		System.out.println(Constants.MAIN_OPTION_2);
		System.out.println(Constants.MAIN_OPTION_3);
		System.out.println(Constants.MAIN_OPTION_4);
		System.out.println(Constants.END_OPTION);
	}
	
	public static void SelectPage() {
		System.out.println(Constants.SELECT_OPTION);
	}
	
	// 1
	public static void StationManagePage() {
		System.out.println(Constants.STATION_MANAGE_TITLE);
		System.out.println(Constants.STATION_MANAGE_OPTION_1);
		System.out.println(Constants.STATION_MANAGE_OPTION_2);
		System.out.println(Constants.STATION_MANAGE_OPTION_3);
		System.out.println(Constants.BACK_OPTION);
	}
	
	// 2
	public static void LineManagePage() {
		System.out.println(Constants.LINE_MANAGE_TITLE);
		System.out.println(Constants.LINE_MANAGE_OPTION_1);
		System.out.println(Constants.LINE_MANAGE_OPTION_2);
		System.out.println(Constants.BACK_OPTION);
	}
	
	// 3
	public static void SectionManagePage() {
		System.out.println(Constants.SECTION_MANAGE_TITLE);
		System.out.println(Constants.SECTION_MANAGE_OPTION_1);
		System.out.println(Constants.SECTION_MANAGE_OPTION_2);
		System.out.println(Constants.BACK_OPTION);
	}
	
	// 4
	public static void MapManagePage() {
		System.out.println(Constants.MAIN_TITLE);
		System.out.println(Constants.MAIN_OPTION_1);
		System.out.println(Constants.MAIN_OPTION_2);
		System.out.println(Constants.MAIN_OPTION_3);
		System.out.println(Constants.MAIN_OPTION_4);
		System.out.println(Constants.END_OPTION);
	}
}