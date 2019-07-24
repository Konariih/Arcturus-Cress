ALTER TABLE `permissions`
ADD COLUMN `auto_credits_amount` INT DEFAULT '0',
ADD COLUMN `auto_pixels_amount` INT DEFAULT '0',
ADD COLUMN `auto_gotw_amount` INT DEFAULT '0',
ADD COLUMN `auto_points_amount` INT DEFAULT '0';

INSERT INTO `emulator_settings`(`key`, `value`) VALUES ('hotel.auto.gotwpoints.enabled', '0');
INSERT INTO `emulator_settings`(`key`, `value`) VALUES ('hotel.auto.gotwpoints.interval', '600');
INSERT INTO `emulator_settings`(`key`, `value`) VALUES ('hotel.auto.gotwpoints.ignore.idled', '1');
INSERT INTO `emulator_settings`(`key`, `value`) VALUES ('hotel.auto.gotwpoints.ignore.hotelview', '1');
INSERT INTO `emulator_settings`(`key`, `value`) VALUES ('hotel.auto.gotwpoints.type', '4');
INSERT INTO `emulator_settings`(`key`, `value`) VALUES ('hotel.auto.gotwpoints.name', 'shell');