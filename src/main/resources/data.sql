INSERT INTO locations (id, name, city, address) VALUES (1, 'City Hall', 'Warsaw', 'Main St 1');
INSERT INTO locations (id, name, city, address) VALUES (2, 'Cultural Center', 'Krakow', 'Rynek 10');

INSERT INTO events (id, name, description, date, capacity, location_id)
VALUES (1, 'Spring Boot Workshop', 'Full-day workshop', '2025-09-10', 50, 1);
INSERT INTO events (id, name, description, date, capacity, location_id)
VALUES (2, 'Java Conference', 'Annual Java conference', '2025-09-20', 200, 2);


INSERT INTO participants (id, name, email) VALUES (1, 'Joanna', 'j.anna@wp.pl');
INSERT INTO participants (id, name, email) VALUES (2, 'Jarek', 'j_arek@wp.pl');
INSERT INTO participants (id, name, email) VALUES (3, 'Marta', 'm_mazur@wp.pl');
INSERT INTO participants (id, name, email) VALUES (4, 'Zosia', 'Zofia12@wp.pl');
INSERT INTO participants (id, name, email) VALUES (5, 'Tadek', 'tadeusz_gustaw@wp.pl');
INSERT INTO participants (id, name, email) VALUES (6, 'Zbysiu', 'zbigniew.ziobro@wp.pl');
INSERT INTO participants (id, name, email) VALUES (7, 'Jola', 'jolantaJola@wp.pl');

INSERT INTO registrations (id, event_id, participant_id) VALUES (1, 1, 1);
INSERT INTO registrations (id, event_id, participant_id) VALUES (2, 2, 2);
INSERT INTO registrations (id, event_id, participant_id) VALUES (3, 1, 3);
INSERT INTO registrations (id, event_id, participant_id) VALUES (4, 2, 4);
INSERT INTO registrations (id, event_id, participant_id) VALUES (5, 1, 6);
INSERT INTO registrations (id, event_id, participant_id) VALUES (6, 2, 7);
INSERT INTO registrations (id, event_id, participant_id) VALUES (7, 1, 5);
