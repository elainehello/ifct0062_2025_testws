    package com.elainevalles.getafe.ifct0062_2025_testws.entity;

    import jakarta.persistence.*;
    import lombok.AllArgsConstructor;
    import lombok.Getter;
    import lombok.NoArgsConstructor;
    import lombok.Setter;

    import java.util.List;

    @Entity
    @Table(name = "tgenres")
    @NoArgsConstructor
    @AllArgsConstructor
    @Getter
    @Setter
    public class Genre {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Integer id;
        @Column (nullable = false, unique = true, length = 50)
        private String name;
        @OneToMany(mappedBy = "genre", cascade = CascadeType.ALL, orphanRemoval = true)
        private List<Movie> movies;

        @Override
        public String toString() {
            return "Genre{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", movies=" + movies +
                    '}';
        }
    }
