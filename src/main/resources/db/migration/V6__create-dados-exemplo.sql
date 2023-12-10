INSERT INTO categoria (nome) VALUES
    ('Eletrônicos'),
    ('Roupas'),
    ('Livros');
INSERT INTO produto (nome, categoria_id) VALUES
    ('Smartphone', 1),
    ('Laptop', 1),
    ('Camiseta', 2),
    ('Calça Jeans', 2),
    ('Java Programming Book', 3),
    ('History Book', 3);
INSERT INTO cliente (nome) VALUES
    ('João Silva'),
    ('Maria Oliveira'),
    ('Carlos Pereira');
INSERT INTO pedido (cliente_id) VALUES
    (1),
    (2),
    (3);
INSERT INTO pedido_produto (pedido_id, produto_id) VALUES
    (1, 1),
    (1, 3),
    (2, 2),
    (2, 4),
    (3, 5),
    (3, 6);
