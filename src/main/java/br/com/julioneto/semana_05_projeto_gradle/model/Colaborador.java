package br.com.julioneto.semana_05_projeto_gradle.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "colaboradores")
public class Colaborador {
    @Id
    @Column(name = "matricula_re", nullable = false, unique = true)
    private Integer matriculaRe;

    @Column(name = "nome", length = 60, nullable = false)
    private String nome;

    @Column(name = "departamento", length = 60, nullable = false)
    private String departamento;

    @Column(name = "salario", nullable = false)
    private Double salario;

    @Column(name = "adicionais")
    private Double adicionais;

    @Column(name = "outros_descontos")
    private Double outrosDescontos;

    public Colaborador(Integer matriculaRe, String nome, String departamento, Double salario, Double adicionais, Double outrosDescontos) {
        this.matriculaRe = matriculaRe;
        this.nome = nome;
        this.departamento = departamento;
        this.salario = salario;
        this.adicionais = adicionais;
        this.outrosDescontos = outrosDescontos;
    }

    public Integer getMatriculaRe() {
        return matriculaRe;
    }

    public void setMatricula_re(Integer matriculaRe) {
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

    public void setOutros_descontos(Double outrosDescontos) {
        this.outrosDescontos = outrosDescontos;
    }

    public Colaborador() {
    }

    @Override
    public String toString() {
        return "Colaborador{" +
                "matriculaRe=" + matriculaRe +
                ", nome='" + nome + '\'' +
                ", departamento='" + departamento + '\'' +
                ", salario=" + salario +
                ", adicionais=" + adicionais +
                ", outrosDescontos=" + outrosDescontos +
                '}';
    }
}
