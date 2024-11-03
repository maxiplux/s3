package app.quantun.s3.command.model.dtos;

import app.quantun.s3.common.enums.AsyncStatus;

public record AsyncApiResponse(String message, AsyncStatus status, String details) {
}
