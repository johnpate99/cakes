CREATE TABLE
    cake
    (
        id BIGINT NOT NULL,
        title VARCHAR,
        desc VARCHAR,
        image VARCHAR,
        PRIMARY KEY (id)
    );

CREATE TABLE
    hibernate_sequence
    (
        next_val BIGINT
    );

INSERT INTO cake (id, title, desc, image)
  VALUES (1, 'Lemon cheesecake', 'A cheesecake made of lemon', 'https://s3-eu-west-1.amazonaws.com/s3.mediafileserver.co.uk/carnation/WebFiles/RecipeImages/lemoncheesecake_lg.jpg');
INSERT INTO cake (id, title, desc, image)
  VALUES (2, 'victoria sponge', 'sponge made with jam', 'http://www.bbcgoodfood.com/sites/bbcgoodfood.com/files/recipe_images/recipe-image-legacy-id--1001468_10.jpg');
INSERT INTO cake (id, title, desc, image)
  VALUES (3, 'Carrot cake', 'Bugs bunnys favourite', 'http://www.villageinn.com/i/pies/profile/carrotcake_main1.jpg');
INSERT INTO cake (id, title, desc, image)
  VALUES (4, 'Banana cake', 'Donkey kongs favourite', 'http://ukcdn.ar-cdn.com/recipes/xlarge/ff22df7f-dbcd-4a09-81f7-9c1d8395d936.jpg');
INSERT INTO cake (id, title, desc, image)
  VALUES (5, 'Birthday cake', 'a yearly treat', 'http://cornandco.com/wp-content/uploads/2014/05/birthday-cake-popcorn.jpg');

INSERT INTO hibernate_sequence (next_val) VALUES (6);