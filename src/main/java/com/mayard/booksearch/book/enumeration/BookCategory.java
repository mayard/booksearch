package com.mayard.booksearch.book.enumeration;

public enum BookCategory {
    c1("국내도서", "소설", 1),
    c3("국내도서", "시/에세이", 3),
    c5("국내도서", "인문", 5),
    c7("국내도서", "가정/생활", 7),
    c8("국내도서", "요리", 8),
    c9("국내도서", "건강", 9),
    c11("국내도서", "취미/스포츠", 11),
    c13("국내도서", "경제/경영", 13),
    c15("국내도서", "자기계발", 15),
    c17("국내도서", "정치/사회", 17),
    c18("국내도서", "정부간행물", 18),
    c19("국내도서", "역사/문화", 19),
    c21("국내도서", "종교", 21),
    c23("국내도서", "예술/대중문화", 23),
    c25("국내도서", "중/고등학습", 25),
    c26("국내도서", "기술/공학", 26),
    c27("국내도서", "외국어", 27),
    c29("국내도서", "과학", 29),
    c31("국내도서", "취업/수험서", 31),
    c32("국내도서", "여행/기행", 32),
    c33("국내도서", "컴퓨터/IT", 33),
    c35("국내도서", "잡지", 35),
    c37("국내도서", "사전", 37),
    c38("국내도서", "청소년", 38),
    c39("국내도서", "초등참고서", 39),
    c41("국내도서", "유아", 41),
    c42("국내도서", "아동", 42),
    c45("국내도서", "어린이영어", 45),
    c47("국내도서", "만화", 47),
    c50("국내도서", "대학교재", 50),
    c51("국내도서", "어린이전집", 51),
    c53("국내도서", "한국소개도서", 53),
    c901("e북", "소설", 901),
    c902("e북", "장르소설", 902),
    c903("e북", "시/에세이", 903),
    c904("e북", "경제/경영", 904),
    c905("e북", "자기계발", 905),
    c906("e북", "인문", 906),
    c907("e북", "정치/사회", 907),
    c908("e북", "로맨스/무협/판타지", 908),
    c909("e북", "종교", 909),
    c910("e북", "예술/대중문화", 910),
    c911("e북", "가정/생활", 911),
    c912("e북", "건강", 912),
    c913("e북", "여행/취미", 913),
    c914("e북", "청소년", 914),
    c915("e북", "학습/수험서", 915),
    c916("e북", "유아", 916),
    c917("e북", "아동", 917),
    c918("e북", "외국어/사전", 918),
    c919("e북", "과학", 919),
    c920("e북", "컴퓨터/IT", 920),
    c921("e북", "잡지", 921),
    c922("e북", "만화", 922),
    c923("e북", "외국도서", 923),
    c924("e북", "무료eBook", 924),
    c925("e북", "개인출판", 925),
    c926("e북", "오디오북", 926),
    c951("e북", "연재", 951),
    c953("e북", "eReader Free", 953),
    c101("영미도서", "문학", 101),
    c103("영미도서", "취미/실용/여행", 103),
    c105("영미도서", "생활/요리/건강", 105),
    c107("영미도서", "예술/건축", 107),
    c109("영미도서", "인문/사회", 109),
    c111("영미도서", "경제/경영", 111),
    c113("영미도서", "과학/기술", 113),
    c115("영미도서", "아동", 115),
    c117("영미도서", "한국관련도서", 117),
    c119("영미도서", "NON_BOOK", 119),
    c120("영미도서", "UMI", 120),
    c181("영미도서", "ELT/영어교재", 181),
    c183("영미도서", "어린이영어", 183),
    c191("영미도서", "대학교재", 191),
    c194("영미도서", "중국관련도서", 194),
    c239("일본도서", "일서메인", 239),
    c241("일본도서", "잡지", 241),
    c243("일본도서", "엔터테인먼트", 243),
    c245("일본도서", "만화", 245),
    c247("일본도서", "문학", 247),
    c249("일본도서", "라이트노벨", 249),
    c251("일본도서", "문고(포켓북)", 251),
    c253("일본도서", "신서(포켓북)", 253),
    c255("일본도서", "아동", 255),
    c257("일본도서", "실용서/예술", 257),
    c259("일본도서", "인문/사회", 259),
    c261("일본도서", "자연/기술과학", 261),
    c263("일본도서", "어학/학습/사전", 263),
    c264("일본도서", "문구/멀티/기타", 264),
    c267("일본도서", "중국관련도서", 267),
    c486("프랑스도서", "프랑스종합", 486),
    c588("독일도서", "독일종합", 588),
    c690("스페인도서", "스페인종합", 690),
    c0("미분류", "미분류", 0);

    private String largeCategory;
    private String middleCategory;
    private int categoryNo;

    BookCategory(String largeCategory, String middleCategory, int categoryNo) {
        this.largeCategory = largeCategory;
        this.middleCategory = middleCategory;
        this.categoryNo = categoryNo;
    }

    public String getLargeCategory() {
        return this.largeCategory;
    }

    public String getMiddleCategory() {
        return this.middleCategory;
    }

    public int getCategoryNo() {
        return this.categoryNo;
    }
}
