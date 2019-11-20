package ru.q1w2e3.pool;

import com.badlogic.gdx.audio.Sound;

import ru.q1w2e3.base.SpritesPool;
import ru.q1w2e3.math.Rect;
import ru.q1w2e3.sprite.Enemy;

public class EnemyPool extends SpritesPool<Enemy> {

    private Rect worldBounds;
    private BulletPool bulletPool;

    public EnemyPool(Rect worldBounds, BulletPool bulletPool) {
        this.worldBounds = worldBounds;
        this.bulletPool = bulletPool;
    }

    @Override
    protected Enemy newObject() {
        return new Enemy(bulletPool, worldBounds);
    }
}
