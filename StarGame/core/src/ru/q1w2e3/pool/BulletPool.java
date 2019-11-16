package ru.q1w2e3.pool;

import ru.q1w2e3.base.SpritesPool;
import ru.q1w2e3.sprite.Bullet;

public class BulletPool extends SpritesPool<Bullet> {
    @Override
    protected Bullet newObject() {
        return new Bullet();
    }
}
