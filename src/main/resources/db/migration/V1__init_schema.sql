CREATE TABLE public.city (
    id        BIGSERIAL PRIMARY KEY,
    city_name VARCHAR(255),
    updated_at TIMESTAMP WITHOUT TIME ZONE,
    created_at TIMESTAMP WITHOUT TIME ZONE
);