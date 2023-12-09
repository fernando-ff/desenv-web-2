
INSERT INTO categoria (nome_categoria) VALUES
    ('Eletrônicos'),
    ('Roupas'),
    ('Alimentos');

INSERT INTO cliente (nome_cliente) VALUES
    ('João Silva'),
    ('Maria Oliveira'),
    ('Carlos Santos');
INSERT INTO pedido (numero_pedido, cliente_id) VALUES
    ('P12345', 1),
    ('P67890', 2),
    ('P54321', 3);
INSERT INTO produto (nome_produto, descricao_produto, preco_produto, data_validade, estoque, fornecedor, ativo, categoria_id, pedido_id) VALUES
    ('Smartphone', 'Último modelo', 999.99, '2023-12-31', 50, "fornecedor A", 1, 1, 1),
    ('Camiseta', 'Malha confortável', 29.99, '2023-12-31', 100, "fornecedor A", 1, 2, 2),
    ('Arroz', 'Tipo 1, 5kg', 10.99, '2024-12-31', 200, 3, "fornecedor A", 3, 3);

INSERT INTO cliente_produto (cliente_id, produto_id) VALUES
    (1, 1),
    (2, 2),
    (3, 3),
    (1, 2),
    (2, 3);
