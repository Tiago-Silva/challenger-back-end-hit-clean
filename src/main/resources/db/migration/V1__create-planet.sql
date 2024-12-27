CREATE TABLE planet (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    climate VARCHAR(255) NOT NULL,
    terrain VARCHAR(255) NOT NULL,
    film_appearances VARCHAR(255) NOT NULL
);