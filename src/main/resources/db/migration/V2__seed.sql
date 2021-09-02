insert into profile(id, current, type, user_id) values (nextval('profile_sequence'), true, 'ONLINE', 'iorran');
insert into channel_config values (nextval('hibernate_sequence'), 'WEB_PUSH');
insert into webpush_config (id, user_id, browser_id)
values (lastval(), 'iorran', 'chrome-2');
insert into subscription (id, channel_config_id, profile_id) values (nextval('hibernate_sequence'), lastval()-1, currval('profile_sequence'));

insert into channel_config values (nextval('hibernate_sequence'), 'WHATSAPP');
insert into whatsapp_config (id, user_id, number)
values (lastval(), 'iorran', '92229222');
insert into subscription (id, channel_config_id, profile_id) values (nextval('hibernate_sequence'), lastval()-1, currval('profile_sequence'));

insert into profile(id, current, type, user_id) values (nextval('profile_sequence'), true, 'ONLINE', 'francisca');
insert into channel_config values (nextval('hibernate_sequence'), 'WHATSAPP');
insert into whatsapp_config (id, user_id, number)
values (lastval(), 'francisca', '91119111');
insert into subscription (id, channel_config_id, profile_id) values (nextval('hibernate_sequence'), lastval()-1, currval('profile_sequence'));

insert into channel_config values (nextval('hibernate_sequence'), 'WEB_PUSH');
insert into webpush_config (id, user_id, browser_id)
values (lastval(), 'francisca', 'chrome-1');
insert into subscription (id, channel_config_id, profile_id) values (nextval('hibernate_sequence'), lastval()-1, currval('profile_sequence'));

insert into profile(id, current, type, user_id) values (nextval('profile_sequence'), false, 'AWAY', 'iorran');
insert into profile(id, current, type, user_id) values (nextval('profile_sequence'), true, 'AWAY', 'francisca');
