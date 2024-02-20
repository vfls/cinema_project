create SCHEMA `cinema_db`;
use `cinema_db`;

create table `cinema_db`.`movies`(
`id` int not null auto_increment,
`movie_title` varchar(255) not null,
`runtime` int not null,
`genre` varchar(15),
`synopsis` text,
`image_url` VARCHAR(255) DEFAULT NULL,
`active` BIT DEFAULT 1,
primary key (`id`))
ENGINE=InnoDB
AUTO_INCREMENT = 1;

create table `cinema_db`.`rooms`(
`id` int not null auto_increment,
`total_seats` int not null,
`available_seats` int not null,
`reserved_seats` int not null,
primary key (`id`))
ENGINE=InnoDB
AUTO_INCREMENT = 1;

create table `cinema_db`.`movie_schedule`(
`id` int not null auto_increment,
`premier_date` datetime,
`end_exhibition` datetime,
`next_session` datetime,
`current_session` datetime,
`past_session` datetime,
primary key (`id`))
ENGINE=InnoDB
AUTO_INCREMENT = 1;

create table `cinema_db`.`tickets`(
`id` int not null auto_increment,
`available_tickets` int not null,
`reserved_tickets` int not null,
`total_tickets` int not null,
`price` decimal not null,
primary key (`id`))
ENGINE=InnoDB
AUTO_INCREMENT = 1;

