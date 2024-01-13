package com.maplestory;

public interface Cube {
    String[] GRADE = {"레어","에픽","유니크","레전더리"};
    String[] RARE_OPTION = {"STR:+3%","공격력+3%","크리티컬:+3%","데미지:+3%","몬스터 방어율 무시:+15%"};
    String[] EPIC_OPTION = {"STR:+6%","공격력+6%","크리티컬:+6%","데미지:+6%","몬스터 방어율 무시:+15%"};
    String[] UNIQUE_OPTION = {"STR:+9%","공격력+9%","크리티컬:+9%","데미지:+9%","몬스터 방어율 무시:+30%","보스 몬스터 공격 시 데미지:+30%"};
    String[] LEGENDARY_OPTION = {"STR:+12%","공격력+9%","크리티컬:+12%","데미지:+12%","몬스터 방어율 무시:+35%","보스 몬스터 공격 시 데미지:+40%"};

    public abstract String[][] changeOption(String[] grade, String[] randomDraw);
}
