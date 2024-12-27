package br.com.challengerbackendhitclean.application.usecase;

public interface UseCase<InputDTO, OutputDTO> {
    OutputDTO execute(InputDTO inputDTO);
}
