package com.sasiri.jobapp.reviewms.review.dto;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ReviewMessage {
    Long id;
    String title;
    String description;
    Double rating;
    Long companyId;
}
