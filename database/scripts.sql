CREATE TABLE "usuario" (
    id BIGSERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    phone VARCHAR(255)
);

INSERT INTO "usuario" (name, phone) VALUES
    ('João Silva', '(11) 98765-4321'),
    ('Maria Oliveira', '(21) 99876-5432'),
    ('Carlos Souza', '(31) 98765-1234'),
    ('Ana Costa', '(41) 99876-4321'),
    ('Pedro Santos', '(51) 98765-6789'),
    ('Lucia Pereira', '(61) 99876-9876'),
    ('Fernando Alves', '(71) 98765-3456'),
    ('Juliana Lima', '(81) 99876-6543'),
    ('Ricardo Rocha', '(91) 98765-8765'),
    ('Amanda Barbosa', '(01) 99876-3210');