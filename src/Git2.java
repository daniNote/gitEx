public class Git2 {
    public static void main(String[] args) {
        System.out.println("두번째 커밋을 위한 파일");
        // 1. 현재 브랜치를 여기로 재설정
        // 2. Soft : 기존 파일을 살리면서 커밋 취소(이전 헤더로 이동)
        // 3. Hard : 파일을 아예 삭제하면서 커밋 취소
        // 커밋 실행 취소(수정한 파일은 그대로 살리면서 이전 단계로 되돌림) == 소프트와 같은 개념

        // 브랜치 따기
        // 'Master'에서 새 브랜치...
        // 체크아웃 선택하고 이동하면, 해당 브랜치로 이동됨

        // 브랜치 병합
        // 'master'에 'new' 병합

        // 깃허브에 레파지토리 만들기
        // 레파지토리 만들고 깃과 연결히면 "원격"이라는 트리가 생김

        // 푸시 단축키 쉬프트+커맨드+K

        // 브랜치 생성 됐는지 확인하기
        // 화살표 아이콘이 "패치"

        // 브랜치를 잘못 선택하고 거기서 작업을 해버린 경우 - 체크아웃 해서 브랜치 옮겨주기
    }
}
