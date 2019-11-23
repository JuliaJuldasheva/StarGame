package ru.q1w2e3.pool;

import ru.q1w2e3.base.SpritesPool;
import ru.q1w2e3.math.Rect;
import ru.q1w2e3.sprite.Enemy;

public class EnemyPool extends SpritesPool<Enemy> {

    private Rect worldBounds;
    private BulletPool bulletPool;
    private ExplosionPool explosionPool;

    public EnemyPool(Rect worldBounds, BulletPool bulletPool, ExplosionPool explosionPool) {
        this.worldBounds = worldBounds;
        this.bulletPool = bulletPool;
        this.explosionPool = explosionPool;
    }

    @Override
    protected Enemy newObject() {
        return new Enemy(bulletPool, explosionPool, worldBounds);
    }
}
