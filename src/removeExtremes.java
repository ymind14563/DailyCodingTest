import java.util.*;

public class removeExtremes {
     	public String[] removeExtremes(String[] arr) {
     // TODO:
 		if (arr.length == 0) return null;

 		//빈배열 생성
 		//초기값(=비교값) 에 첫번째 arr 배열요소 글자수 입력
 		//비교하여(같은 것도 포함해야 제일 나중위치가 고려됨)
 		//비교값에 해당 배열 요소 넣어주고,
 		//짧은 배열요소, 긴배열 요소 의 인덱스값 입력
 		//짧은, 긴 인덱스 값이 아니면 빈배열에 넣기
		//출력

 		String[] result = new String[arr.length - 2];
 		int compare_arr_long = arr[0].length();
		int compare_arr_short = arr[0].length();
 		int longIndex = 0;
 		int shortIndex = 0;

 		for (int i = 1; i < arr.length; i++){
 			if (compare_arr_long <= arr[i].length()){
 			compare_arr_long = arr[i].length();
 			longIndex = i;
 			}
 			if (compare_arr_short >= arr[i].length()){
 			compare_arr_short = arr[i].length();
 			shortIndex = i;
 			}
 		}
 		int j = 0;
 		for (int i = 0; i < arr.length; i++){
 			if (i != longIndex && i != shortIndex){
 				result[j] = arr[i];
 				j++;
 			}
 		}
 		return result;
 	}
}
