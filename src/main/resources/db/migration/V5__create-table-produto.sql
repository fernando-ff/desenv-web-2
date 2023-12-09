DROP TABLE IF EXISTS produto;
CREATE TABLE produto (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome_produto VARCHAR(50) NOT NULL,
    descricao_produto VARCHAR(100) NOT NULL,
    preco_produto DOUBLE,
    data_validade VARCHAR(15),
    estoque INT,
    fornecedor VARCHAR(15),
    ativo INT,
    categoria_id INT,
    pedido_id INT,
    FOREIGN KEY (categoria_id) REFERENCES categoria (id),
    FOREIGN KEY (pedido_id) REFERENCES pedido (id)
);
DROP TABLE IF EXISTS cliente_produto;
CREATE TABLE cliente_produto (
    cliente_id INT,
    produto_id INT,
    PRIMARY KEY (cliente_id, produto_id),
    FOREIGN KEY (cliente_id) REFERENCES cliente (id),
    FOREIGN KEY (produto_id) REFERENCES produto (id)
);

