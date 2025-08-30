package com.neet_question_api.api.modal;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Data
public class AnswerValidation {
    private String student_id;
    private String ch_id;
    private int question_id;
    private int selected_ans;
}
