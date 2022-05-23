package br.com.julioneto.semana_05_projeto_gradle.dto;

import br.com.julioneto.semana_05_projeto_gradle.model.Colaborador;

import javax.persistence.Column;

import static br.com.julioneto.semana_05_projeto_gradle.utils.SystemTools.*;

public class ColaboradorDTO {

    private Integer matriculaRe;
    private String nome;
    private String departamento;
    private Double salario;
    private Double adicionais;
    private Double outrosDescontos;
    private Double inss;
    private Double irpf;


    public ColaboradorDTO(Integer matriculaRe, String nome, String departamento, Double salario, Double adicionais, Double outrosDescontos) {
        this.matriculaRe = matriculaRe;
        this.nome = nome;
        this.departamento = departamento;
        this.salario = salario;
        this.adicionais = adicionais;
        this.outrosDescontos = outrosDescontos;
        this.inss = calcularINSS(this.getSalario());
        this.irpf = calcularIRPF(this.getSalario());
    }

    public ColaboradorDTO(Colaborador colaborador) {
        this.matriculaRe = colaborador.getMatriculaRe();
        this.nome = colaborador.getNome();
        this.departamento = colaborador.getDepartamento();
        this.salario = colaborador.getSalario();
        this.adicionais = colaborador.getAdicionais();
        this.outrosDescontos = colaborador.getOutrosDescontos();
        this.inss = calcularINSS(this.getSalario());
        this.irpf = calcularIRPF(this.getSalario());
    }

    public Integer getMatriculaRe() {
        return matriculaRe;
    }

    public void setMatriculaRe(Integer matriculaRe) {
        this.matriculaRe = matriculaRe;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Double getAdicionais() {
        return adicionais;
    }

    public void setAdicionais(Double adicionais) {
        this.adicionais = adicionais;
    }

    public Double getOutrosDescontos() {
        return outrosDescontos;
    }

    public void setOutrosDescontos(Double outrosDescontos) {
        this.outrosDescontos = outrosDescontos;
    }

    public Double getInss() {
        return inss;
    }

    public void setInss(Double inss) {
        this.inss = calcularINSS(this.getSalario());
    }

    public Double getIrpf() {
        return irpf;
    }

    public void setIrpf(Double irpf) {
        this.irpf = calcularIRPF(this.getSalario());
    }
}
