package com.evry.fs.payment.pms.srv.model;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class UpdateProjectRequest {
	private int projectId;
	private String projectName;
}
