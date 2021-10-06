insert into event(id, name, parent_id) values (nextval('event_sequence'), 'CARGO_CREATE', null);
insert into event(id, name, parent_id) values (nextval('event_sequence'), 'NOMINATION', null);

-- Profile
-- channel
insert into profile(id, current, type, user_id) values (nextval('profile_sequence'), true, 'ONLINE', 'iorran');
insert into channel_config(id, type, user_id, browser_id) values (nextval('hibernate_sequence'), 'WEB_PUSH', 'iorran', 'chrome-2');
insert into subscription (id, channel_config_id, profile_id, event_id) values (
                                                                               nextval('hibernate_sequence'),
                                                                               lastval()-1,
                                                                               currval('profile_sequence'),
                                                                               currval('event_sequence'));

insert into channel_config(id, type, user_id, number) values (nextval('hibernate_sequence'), 'WHATSAPP', 'iorran', '92229222');
insert into subscription (id, channel_config_id, profile_id, event_id) values (nextval('hibernate_sequence'),
                                                                               lastval()-1,
                                                                               currval('profile_sequence'),
                                                                               currval('event_sequence')-1);

insert into profile(id, current, type, user_id) values (nextval('profile_sequence'), true, 'ONLINE', 'francisca');
insert into channel_config(id, type, user_id, number)  values (nextval('hibernate_sequence'), 'WHATSAPP', 'francisca', '91119111');
insert into subscription (id, channel_config_id, profile_id, event_id) values (nextval('hibernate_sequence'),
                                                                               lastval()-1,
                                                                               currval('profile_sequence'),
                                                                               currval('event_sequence'));

insert into channel_config (id, type, user_id, browser_id) values (nextval('hibernate_sequence'), 'WEB_PUSH', 'francisca', 'chrome-1');
insert into subscription (id, channel_config_id, profile_id, event_id) values (nextval('hibernate_sequence'),
                                                                               lastval()-1,
                                                                               currval('profile_sequence'),
                                                                               currval('event_sequence')-1);

insert into profile(id, current, type, user_id) values (nextval('profile_sequence'), false, 'AWAY', 'iorran');
insert into profile(id, current, type, user_id) values (nextval('profile_sequence'), true, 'AWAY', 'francisca');
