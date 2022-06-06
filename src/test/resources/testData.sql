INSERT INTO game_record (game_code, game_name, game_type, total_tips)
VALUES ('11081060', '$30 buyin Touney $350 added', "NL Hold'em", 66);

INSERT INTO player_record (game_record_game_code, id, player_id, player_name, hands, tips, buyin, profit)
VALUES ('11081060', 1, '#VHJMK', 'Tim Victor', 20, 3, 30, 118);

INSERT INTO player_record(game_record_game_code, id, player_id, player_name, hands, tips, buyin, profit)
VALUES ('11081060', 2, '#WHTU4', 'Big C', 70, 3, 30, 70);

INSERT INTO game_record (game_code, game_name, game_type, total_tips)
VALUES ('21366727', 'BigBlind: 1', "NL Hold'em", 113.61);

INSERT INTO player_record (game_record_game_code, id, player_id, player_name, hands, tips, buyin, profit)
VALUES ('21366727', 3, "#C92A5", "Charlie Bravo", 103, 20.5, 25, 5.47);

INSERT INTO player_record (game_record_game_code, id, player_id, player_name, hands, tips, buyin, profit)
VALUES ('21366727', 4, "#R3HWY", "d-_-b", 104, 21.54, 250, .57);
