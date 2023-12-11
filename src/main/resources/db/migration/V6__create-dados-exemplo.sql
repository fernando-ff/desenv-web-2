-- Insert data into the 'cliente' table
INSERT INTO cliente (nome_cliente, ativo) VALUES
('Cliente A', 1),
('Cliente B', 1),
('Cliente C', 1);

-- Insert data into the 'categoria' table
INSERT INTO categoria (nome_categoria, ativo) VALUES
('Categoria X', 1),
('Categoria Y', 1),
('Categoria Z', 1);

-- Insert data into the 'produto' table
INSERT INTO produto (nome_produto, estoque_produto, ativo, fornecedor_produto, preco_compra_produto, preco_venda_produto, categoria_id) VALUES
('Produto 1', 50, 1, 'Fornecedor A', 10.00, 20.00, 1),
('Produto 2', 30, 1, 'Fornecedor B', 15.00, 25.00, 2),
('Produto 3', 20, 1, 'Fornecedor C', 8.00, 18.00, 3);

-- Insert data into the 'pedido' table
INSERT INTO pedido (quantidade, ativo, cliente_id) VALUES
(5, 1, 1),
(10, 1, 2),
(8, 1, 3);

-- Insert data into the 'pedido_produto' table
INSERT INTO pedido_produto (pedido_id, produto_id) VALUES
(1, 1),
(1, 2),
(2, 2),
(3, 3);
