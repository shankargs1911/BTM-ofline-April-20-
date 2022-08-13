SELECT `resort`.`id`,
    `resort`.`name`,
    `resort`.`location`,
    `resort`.`checkintime`,
    `resort`.`checkouttime`,
    `resort`.`createby`,
    `resort`.`createdate`,
    `resort`.`updatedate`,
    `resort`.`owner`,
    `resort`.`priceperday`
FROM `resort`.`resort_info`;

SELECT * FROM resort.resort_info;
desc resort;