package com.success.common.constant;

/**
 * @author zhang
 */
public enum CalculationResultEnum implements IEnum{
    ERA_F(0,"ERA_f"),
    ERA_GAMMA(1,"ERA_gamma"),
    ERA_MIU(2,"ERA_miu"),
    ERA_PHI(3,"ERA_phi"),
    ERA_ZETA(4,"ERA_zeta");
    private int code;
    private String name;

    CalculationResultEnum(int code,String name){
        this.code=code;
        this.name=name;
    }

    @Override
    public int getCode() {
        return code;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "CalculationResultEnum{" +
                "code=" + code +
                ", name='" + name + '\'' +
                '}';
    }
}
