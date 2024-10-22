create table products (
    product_id bigint not null,
    name varchar(255) not null,
    status bool NOT NULL default true,
    stock int not null,
    createdAt timestamp(6) NOT NULL,
    updatedAt timestamp(6) NOT NULL,
    constraint pk_products primary key (product_id)
);