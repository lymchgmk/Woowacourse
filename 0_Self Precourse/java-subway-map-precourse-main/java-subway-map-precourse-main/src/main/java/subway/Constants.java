package subway;

public class Constants {
	// 공통
	public static final String SELECT_OPTION = "## 원하는 기능을 선택하세요.";
	public static final String BACK_OPTION = "B. 돌아가기";
	
	public static final String INFO = "[INFO] ";
	public static final String ERROR = "[ERROR] ";

	public static final String[] ALLOWED_INPUT = {"1" ,"2", "3", "4", "B", "Q"};
	
	// 메인 화면
	public static final String MAIN_TITLE ="## 메인 화면";
	public static final String MAIN_OPTION_1 = "1. 역 관리";
	public static final String MAIN_OPTION_2 = "2. 노선 관리";
	public static final String MAIN_OPTION_3 = "3. 구간 관리";
	public static final String MAIN_OPTION_4 = "4. 지하철 노선도 출력";
	public static final String END_OPTION = "Q. 종료";
	
	// 1. 역 관리 화면
	public static final String STATION_MANAGE_TITLE = "## 역 관리 화면";
	public static final String STATION_MANAGE_OPTION_1 = "1. 역 등록";
	public static final String STATION_ENROLL_STATION = "## 등록할 역 이름을 입력하세요.";
	public static final String STATION_ENROLL_SUCCESS = "지하철 역이 등록되었습니다.";
	
	public static final String STATION_MANAGE_OPTION_2 = "2. 역 삭제";
	public static final String STATION_DELETE_STATION = "## 삭제할 역 이름을 입력하세요.";
	public static final String STATION_DELETE_SUCCESS = "지하철 역이 삭제되었습니다.";
	
	public static final String STATION_MANAGE_OPTION_3 = "3. 역 조회";
	public static final String STATION_LIST = "## 역 목록";
	
	// 2. 노선 관리
	public static final String LINE_MANAGE_TITLE = "## 노선 관리 화면";
	public static final String LINE_MANAGE_OPTION_1 = "1. 노선 등록";
	public static final String LINE_ENROLL_LINE = "## 등록할 노선 이름을 입력하세요.";
	public static final String LINE_ENROLL_START_STATION = "## 등록할 노선의 상행 종점역 이름을 입력하세요.";
	public static final String LINE_ENROLL_END_STATION = "## 등록할 노선의 하행 종점역 이름을 입력하세요.";
	public static final String LINE_ENROLL_SUCCESS = "지하철 역이 등록되었습니다.";
	
	public static final String LINE_MANAGE_OPTION_2 = "2. 노선 삭제";
	public static final String LINE_DELETE_LINE = "## 삭제할 노선 이름을 입력하세요.";
	public static final String LINE_DELETE_SUCCESS = "지하철 역이 삭제되었습니다.";
	
	public static final String LINE_MANAGE_OPTION_3 = "3. 노선 조회";
	public static final String LINE_LIST = "## 노선 목록";
	
	// 3. 구간 관리
	public static final String SECTION_MANAGE_TITLE = "## 구간 관리 화면";
	
	public static final String SECTION_MANAGE_OPTION_1 = "1. 구간 등록";
	public static final String SECTION_ENROLL_LINE = "## 노선을 입력하세요.";
	public static final String SECTION_ENROLL_STATION = "## 역이름을 입력하세요.";
	public static final String SECTION_ENROLL_SUCCESS = "구간이 등록되었습니다.";
	
	public static final String SECTION_MANAGE_OPTION_2 = "2. 구간 삭제";
	public static final String SECTION_DELETE_LINE = "## 삭제할 구간의 노선을 입력하세요.";
	public static final String SECTION_DELETE_STATION = "## 삭제할 구간의 역을 입력하세요.";
	public static final String SECTION_DELETE_SUCCESS = "구간이 삭제되었습니다.";
	
	// 4. 지하철 노선도 출력
	public static final String MAP_MANAGE_TITLE = "## 지하철 노선도";
	public static final String DELETED_STATION = "---";
}
