package koschei.models;

import org.springframework.stereotype.Component;

@Component
public class Egg6 {
    final Deth8 death;

    public Egg6(Deth8 death) {
        this.death = death;
    }

    @Override
    public String toString() {
        return ", в яйце иголка " + death.toString();
    }
}
