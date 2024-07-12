create table topicos(

    id bigint not null auto_increment,
    titulo varchar(100) not null unique,
    mensagem varchar(999) not null,
    dataCriacao datetime not null,
    ativo tinyint,
    usuario_id bigint not null,
    curso varchar(100) not null,
    resposta_id bigint not null,

    primary key(id),
    constraint fk_topicos_usuario_id foreign key(usuario_id) references usuarios(id)

);