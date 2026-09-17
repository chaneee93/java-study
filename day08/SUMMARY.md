# Day08 배열과 문자열 — 정리

## 오늘의 한 문장
문자열 비교는 무조건 equals. 예외 없음.

## 핵심 정리
| 주제 | 함정/포인트 | 해결 |
|---|---|---|
| 배열 대입 | int[] b = a 는 주소 복사 (같이 바뀜) | Arrays.copyOf 로 새 배열 |
| 객체 배열 | new Student[3]은 자리만, 내용물 null | 각 자리 new |
| 얕은/깊은 복사 | copyOf 해도 요소 주소는 공유 | 요소도 new |
| ArrayList remove | remove(1)은 인덱스 삭제 | 값은 remove(Integer.valueOf(20)) |
| contains | equals 없으면 항상 false | equals + hashCode 구현 |
| 순회 중 삭제 | ConcurrentModificationException | removeIf |
| 문자열 == | 리터럴은 true, new/입력값은 false | 항상 equals |
| 문자열 연결 | 불변이라 반복 연결이 느림 | StringBuilder |
| 문자열 메서드 | 원본 안 바뀜 | s = s.trim() |
| int 상수 | 없는 값도 통과 (런타임에 터짐) | enum (컴파일 단계 차단) |
| enum 저장 | ordinal()은 순서 바뀌면 깨짐 | name() 저장 |
| 값 객체 | 일반 클래스는 길다 | record 한 줄 |

## 다시 만나는 날
- Day09: 제네릭(꺾쇠의 정체), Set·Map
- Day15: record 로 DTO
- Day44: enum 을 DB 저장 (name 사용)
