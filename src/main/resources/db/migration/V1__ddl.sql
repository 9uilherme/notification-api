create table if not exists event (
                                       name varchar(255),
                                       parent_id bigint,
                                       id bigint not null,
                                       primary key (id),
                                       constraint event_parent_fk foreign key (parent_id) references event(id));

create table if not exists profile (
                                       type varchar(255),
                                       current boolean,
                                       user_id varchar(255),
                                       id bigint not null,
                                       primary key (id));

create table if not exists channel_config (
                                              id bigint not null,
                                              type varchar(255),
                                              primary key (id));

create table if not exists subscription (
                                            id bigint not null,
                                            channel_config_id bigint,
                                            profile_id bigint,
                                            event_id bigint,
                                            primary key (id),
                                            constraint subscription_channel_fk foreign key (channel_config_id) references channel_config(id),
                                            constraint subscription_profile_fk foreign key (profile_id) references profile(id),
                                            constraint profile_event_fk foreign key (event_id) references event(id));

create table if not exists webpush_Config (
                                              browser_id varchar(255),
                                              user_id varchar(255),
                                              id bigint not null,
                                              primary key (id),
                                              constraint webpush_channel_fk foreign key (id) references channel_config(id));

create table if not exists whatsapp_Config (
                                               number varchar(255),
                                               user_id varchar(255),
                                               id bigint not null,
                                               primary key (id),
                                               constraint whatsapp_channel_fk foreign key (id) references channel_config(id));

create table if not exists microsoft_teams_config (
                                                      webhook varchar(255),
                                                      legal_entity varchar(255),
                                                      name varchar(255),
                                                      id bigint not null,
                                                      primary key (id),
                                                      constraint microsoft_channel_fk foreign key (id) references channel_config(id));

drop sequence if exists hibernate_sequence;
create sequence hibernate_sequence start with 1 increment by 1;

drop sequence if exists profile_sequence;
create sequence profile_sequence start with 1 increment by 1;
