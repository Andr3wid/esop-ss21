package Assignment10.Andreas.beverages;

import Assignment10.Andreas.exceptions.BeverageTooColdException;

public class Tea implements IHot {
    float degrees;

    public Tea() {
        this.degrees = 100;
    }

    @Override
    public float getDegreesCelsius() {
        return 65.5f;
    }

    @Override
    public void burn() {
        System.out.println("We poured tea and it is very hot!");
    }

    @Override
    public void cooldown(float coolDownFactor) throws BeverageTooColdException {
        degrees = degrees-coolDownFactor;
        if(degrees < 0) {
            throw new BeverageTooColdException();
        }
    }
}
