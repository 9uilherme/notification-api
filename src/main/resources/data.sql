insert into channel values (nextval('hibernate_sequence'), 'WEB_PUSH');
insert into webpush (id, user_id, browser_id)
values (lastval(), 'francisca', 'chrome-1');
insert into subscription values (nextval('hibernate_sequence'), null, lastval()-1);

insert into channel values (nextval('hibernate_sequence'), 'WEB_PUSH');
insert into webpush (id, user_id, browser_id)
values (lastval(), 'iorran', 'chrome-2');
insert into subscription values (nextval('hibernate_sequence'), null, lastval()-1);

insert into channel values (nextval('hibernate_sequence'), 'WHATSAPP');
insert into whatsapp (id, user_id, number)
values (lastval(), 'francisca', '91119111');
insert into subscription values (nextval('hibernate_sequence'), null, lastval()-1);

insert into channel values (nextval('hibernate_sequence'), 'WHATSAPP');
insert into whatsapp (id, user_id, number)
values (lastval(), 'iorran', '92229222');
insert into subscription values (nextval('hibernate_sequence'), null, lastval()-1);
