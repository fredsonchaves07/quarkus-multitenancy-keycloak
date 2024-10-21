create table products (
    product_id serial not null,
    name varchar(100) not null,
    status bool NOT NULL default true,
    stock int not null,
    createdAt timestamp(6) NOT NULL,
    deletedAt timestamp(6) NOT NULL,
    constraint pk_products primary key (product_id)
);