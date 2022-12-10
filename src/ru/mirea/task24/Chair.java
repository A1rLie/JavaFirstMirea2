package ru.mirea.task24;

enum Chairs {
    VICTORIAN_CHAIR,
    MULTIFUINCTIONAL_CHAIR,
    MAGIC_CHAIR
}

public interface Chair {
    String getName();
}

class Victorian_chair implements Chair {
    @Override
    public String getName() {
        return "викторианский стул";
    }
}

class Multifunctional_chair implements Chair {
    @Override
    public String getName() {
        return "многофункциональный стул";
    }
}
class Magic_chair implements Chair{
    @Override
    public String getName() {
        return "магический стул";
    }
}