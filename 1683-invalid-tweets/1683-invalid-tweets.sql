# Write your MySQL query statement below
SELECT tweet_id FROM tweets
WHERE CHAR_LENGTH(CONTENT) > 15;