USE adlister_db;

INSERT INTO users (username, email, password) VALUES
('nacho', 'nacho@email.com', 'password');

INSERT INTO ads (user_id, title, description) VALUES
(1, 'Test Ad 1', 'Generic description of test ad 1'),
(1, 'Test Ad 2', 'Generic description of test ad 2'),
(1, 'Test Ad 3', 'Generic description of test ad 3'),
(1, 'Test Ad 4', 'Generic description of test ad 4'),
(1, 'Test Ad 5', 'Generic description of test ad 5');