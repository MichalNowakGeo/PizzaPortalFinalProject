CREATE TABLE IF NOT EXISTS pizza_ingredients (
    pizza_id BIGINT NOT NULL,
    ingredient_id BIGINT NOT NULL,
    PRIMARY KEY (pizza_id, ingredient_id),
    FOREIGN KEY (pizza_id) REFERENCES pizzas (id),
    FOREIGN KEY (ingredient_id) REFERENCES ingredients (id)
    );