package Assignment10.Andreas.beverages;

import Assignment10.Andreas.exceptions.BeverageTooColdException;

public interface IHot {

    float getDegreesCelsius();
    void burn();
    void cooldown(float coolDownFactor) throws BeverageTooColdException;

}
