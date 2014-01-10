# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table game (
  id                        bigint not null,
  title                     varchar(255),
  owned                     boolean,
  created_by_email          varchar(255),
  created                   timestamp not null,
  constraint uq_game_title unique (title),
  constraint pk_game primary key (id))
;

create table account (
  email                     varchar(255) not null,
  name                      varchar(255),
  password                  varchar(255),
  constraint pk_account primary key (email))
;

create table vote (
  id                        bigint not null,
  game_id                   bigint not null,
  created_by_email          varchar(255),
  constraint pk_vote primary key (id))
;

create sequence game_seq;

create sequence account_seq;

create sequence vote_seq;

alter table game add constraint fk_game_createdBy_1 foreign key (created_by_email) references account (email) on delete restrict on update restrict;
create index ix_game_createdBy_1 on game (created_by_email);
alter table vote add constraint fk_vote_game_2 foreign key (game_id) references game (id) on delete restrict on update restrict;
create index ix_vote_game_2 on vote (game_id);
alter table vote add constraint fk_vote_createdBy_3 foreign key (created_by_email) references account (email) on delete restrict on update restrict;
create index ix_vote_createdBy_3 on vote (created_by_email);



# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists game;

drop table if exists account;

drop table if exists vote;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists game_seq;

drop sequence if exists account_seq;

drop sequence if exists vote_seq;

